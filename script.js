const urlParams = new URLSearchParams(window.location.search);
const guestName = urlParams.get('to');
if (guestName) {
    document.getElementById('guest-name').innerText = guestName;
}

function openInvitation() {
    document.getElementById('cover').classList.add('hidden');
    playMusic();
}

window.addEventListener('wheel', function(e) {
    const cover = document.getElementById('cover');
    if (!cover.classList.contains('hidden')) {
        openInvitation();
    }
}, { passive: true });

window.addEventListener('touchmove', function(e) {
    const cover = document.getElementById('cover');
    if (!cover.classList.contains('hidden')) {
        openInvitation();
    }
}, { passive: true });

const audio = document.getElementById('bg-music');
const musicBtn = document.getElementById('music-control');

function playMusic() {
    audio.play().then(() => {
        musicBtn.classList.remove('paused');
    }).catch(err => console.log("Autoplay blocked by browser policy"));
}

function toggleMusic() {
    if (audio.paused) {
        audio.play();
        musicBtn.classList.remove('paused');
    } else {
        audio.pause();
        musicBtn.classList.add('paused');
    }
}

const eventDate = new Date("Dec 31, 2027 09:00:00").getTime();
setInterval(() => {
    const now = new Date().getTime();
    const distance = eventDate - now;

    if (distance > 0) {
        document.getElementById("days").innerText = Math.floor(distance / (1000 * 60 * 60 * 24));
        document.getElementById("hours").innerText = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        document.getElementById("minutes").innerText = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        document.getElementById("seconds").innerText = Math.floor((distance % (1000 * 60)) / 1000);
    }
}, 1000);

function copyText(elementId) {
    const text = document.getElementById(elementId).innerText;
    navigator.clipboard.writeText(text).then(() => {
        alert('Nomor rekening berhasil disalin!');
    });
}

function submitWish(event) {
    event.preventDefault();
    const name = document.getElementById('wish-name').value;
    const attendance = document.getElementById('wish-attendance').value;
    const message = document.getElementById('wish-message').value;

    const wishesList = document.getElementById('wishes-list');
    const newWish = document.createElement('div');
    newWish.className = 'bg-white p-2 rounded mb-2 shadow-sm';
    newWish.innerHTML = `
        <strong class="small d-block text-danger">${name}</strong>
        <span class="badge ${attendance === 'Hadir' ? 'bg-success' : 'bg-secondary'} mb-1">${attendance}</span>
        <p class="small text-muted mb-0 text_justify">${message}</p>
    `;

    wishesList.prepend(newWish);
    document.getElementById('rsvp-form').reset();
}

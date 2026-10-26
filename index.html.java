<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Undangan Pernikahan - Noel & Grace</title>
    
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Cinzel:wght@400;600;700&family=Montserrat:wght@300;400;500&family=Playfair+Display:ital,wght@0,400;0,600;1,400&display=swap" rel="stylesheet">
    
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

    <style>
        :root {
            --bg-dark: #0b1522;
            --bg-card: #121f30;
            --text-light: #e6ecf2;
            --text-muted: #94a3b8;
            --accent-white: #ffffff;
            --font-heading: 'Cinzel', serif;
            --font-subheading: 'Playfair Display', serif;
            --font-body: 'Montserrat', sans-serif;
        }

        body {
            background-color: var(--bg-dark);
            color: var(--text-light);
            font-family: var(--font-body);
            overflow-x: hidden;
        }

        h1, h2, h3, .font-heading {
            font-family: var(--font-heading);
            letter-spacing: 2px;
        }

        .font-subheading {
            font-family: var(--font-subheading);
        }

        /* Cover Section */
        .hero-section {
            height: 100vh;
            background: linear-gradient(to bottom, rgba(11, 21, 34, 0.4), rgba(11, 21, 34, 0.9)), 
                        url('https://images.unsplash.com/photo-1519741497674-611481863552?auto=format&fit=crop&w=1200&q=80') center/cover no-repeat;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            position: relative;
        }

        .hashtag {
            font-family: var(--font-heading);
            letter-spacing: 4px;
            font-size: 1.2rem;
            color: var(--text-muted);
        }

        /* Image Cards */
        .img-frame {
            border: 1px solid rgba(255, 255, 255, 0.1);
            padding: 10px;
            background-color: var(--bg-card);
            box-shadow: 0 10px 30px rgba(0,0,0,0.5);
            border-radius: 4px;
        }

        .img-frame img {
            width: 100%;
            height: auto;
            object-fit: cover;
        }

        /* Dotted Separator */
        .dotted-line {
            border-bottom: 2px dotted rgba(255, 255, 255, 0.3);
            margin: 40px auto;
            width: 80%;
        }

        /* Countdown Timer */
        .timer-box {
            background-color: var(--bg-card);
            border: 1px solid rgba(255, 255, 255, 0.1);
            padding: 15px;
            border-radius: 6px;
            min-width: 80px;
        }

        .timer-box span {
            font-family: var(--font-heading);
            font-size: 1.8rem;
            display: block;
        }

        .timer-box label {
            font-size: 0.75rem;
            color: var(--text-muted);
            text-transform: uppercase;
        }

        /* Buttons */
        .btn-custom {
            background-color: var(--accent-white);
            color: var(--bg-dark);
            font-family: var(--font-heading);
            letter-spacing: 2px;
            border: none;
            padding: 12px 30px;
            border-radius: 0;
            transition: all 0.3s ease;
        }

        .btn-custom:hover {
            background-color: #d1d5db;
            color: var(--bg-dark);
            transform: translateY(-2px);
        }

        /* Floating Audio Control */
        .audio-control {
            position: fixed;
            bottom: 20px;
            right: 20px;
            z-index: 1000;
            background: rgba(255, 255, 255, 0.2);
            backdrop-filter: blur(5px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            color: #fff;
            width: 45px;
            height: 45px;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            cursor: pointer;
        }

        /* Modal Customization */
        .modal-content {
            background-color: var(--bg-card);
            color: var(--text-light);
            border: 1px solid rgba(255, 255, 255, 0.1);
        }

        .form-control, .form-select {
            background-color: rgba(255, 255, 255, 0.05);
            border: 1px solid rgba(255, 255, 255, 0.2);
            color: #fff;
        }

        .form-control:focus, .form-select:focus {
            background-color: rgba(255, 255, 255, 0.1);
            color: #fff;
            border-color: #fff;
            box-shadow: none;
        }

        .form-control::placeholder {
            color: var(--text-muted);
        }
    </style>
</head>
<body>

    <!-- Audio Player (Ganti URL audio sesuai keinginan) -->
    <audio id="bg-music" loop>
        <source src="https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3" type="audio/mpeg">
    </audio>

    <div class="audio-control" onclick="toggleAudio()" id="audioBtn">
        <i class="fas fa-music"></i>
    </div>

    <!-- HERO SECTION -->
    <section class="hero-section">
        <div class="container text-center text-white px-3">
            <h1 class="display-3 fw-normal mb-2">NOEL & GRACE</h1>
            <p class="font-subheading fs-5 text-uppercase tracking-wide">AUGUST 25, 2030 — KALAYAAN GRAND HOTEL</p>
            <div class="mt-4">
                <a href="#details" class="btn btn-custom mt-3">LIHAT DETAIL</a>
            </div>
        </div>
    </section>

    <!-- HASHTAG & PHOTO 1 -->
    <section class="py-5 text-center">
        <div class="container">
            <h2 class="hashtag mb-4">#NOELGRACEDWITHLOVE</h2>
            <div class="row justify-content-center">
                <div class="col-md-8 col-lg-6">
                    <div class="img-frame">
                        <img src="https://images.unsplash.com/photo-1583939003579-730e3918a45a?auto=format&fit=crop&w=800&q=80" alt="Pasangan Hand Detail" class="img-fluid">
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- PHOTO 2 SECTION -->
    <section class="py-3 text-center">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-10 col-lg-8">
                    <div class="img-frame">
                        <img src="https://images.unsplash.com/photo-1511285560929-80b456fea0bc?auto=format&fit=crop&w=1000&q=80" alt="Pasangan Tersenyum" class="img-fluid">
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- COUNTDOWN TIMER -->
    <section class="py-4 text-center">
        <div class="container">
            <h3 class="font-heading fs-5 mb-4 text-uppercase">Menghitung Hari</h3>
            <div class="d-flex justify-content-center gap-3" id="countdown">
                <div class="timer-box"><span id="days">00</span><label>Hari</label></div>
                <div class="timer-box"><span id="hours">00</span><label>Jam</label></div>
                <div class="timer-box"><span id="minutes">00</span><label>Menit</label></div>
                <div class="timer-box"><span id="seconds">00</span><label>Detik</label></div>
            </div>
        </div>
    </section>

    <!-- RECEPTION DETAILS -->
    <section id="details" class="py-5 text-center">
        <div class="container">
            <h2 class="display-6 font-heading mb-2">RECEPTION DETAILS</h2>
            <p class="text-muted font-subheading mb-5">Share details about your ceremony, reception, or anything else here.</p>

            <div class="row g-4 text-start justify-content-center">
                <!-- Venue -->
                <div class="col-md-4">
                    <div class="px-3">
                        <h4 class="font-heading fs-5 text-center text-md-start mb-3">VENUE</h4>
                        <p class="text-muted small">Our celebration will be held at the Kalayaan Grand Hotel. We'll be welcoming guests in the Imperial Hall, located on the 2nd floor. Signage and staff will be available to assist upon arrival.</p>
                    </div>
                </div>
                <!-- Attire -->
                <div class="col-md-4">
                    <div class="px-3">
                        <h4 class="font-heading fs-5 text-center text-md-start mb-3">ATTIRE</h4>
                        <p class="text-muted small">The dress code is formal or Filipiniana-inspired. Barong, dressy ternos, or cocktail dresses in soft, elegant colors are welcome.</p>
                    </div>
                </div>
                <!-- Kids -->
                <div class="col-md-4">
                    <div class="px-3">
                        <h4 class="font-heading fs-5 text-center text-md-start mb-3">KIDS</h4>
                        <p class="text-muted small">As much as we love your little ones, we're keeping this evening an adults-only affair to ensure a relaxed and focused celebration. We hope you enjoy the night out!</p>
                    </div>
                </div>
            </div>

            <!-- Wide Photo -->
            <div class="row justify-content-center mt-5">
                <div class="col-md-10 col-lg-8">
                    <div class="img-frame">
                        <img src="https://images.unsplash.com/photo-1522673607200-164d1b6ce486?auto=format&fit=crop&w=1000&q=80" alt="Pasangan Outdoor" class="img-fluid">
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- GIFT REGISTRY -->
    <section class="py-5 text-center">
        <div class="container">
            <h2 class="display-6 font-heading mb-2">GIFT REGISTRY</h2>
            <p class="font-subheading fs-5 text-muted mb-4">Your presence is truly the best gift we could ask for.</p>

            <div class="dotted-line"></div>

            <div class="row align-items-center justify-content-center my-4">
                <div class="col-md-3 text-center mb-4 mb-md-0">
                    <!-- QR Code Dummy -->
                    <div class="bg-white p-3 d-inline-block rounded">
                        <img src="https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=GiftRegistryNoelGrace" alt="QR Code Gift" class="img-fluid">
                    </div>
                </div>
                <div class="col-md-6 text-center text-md-start">
                    <p class="text-muted small mb-3">
                        But if you feel called to give a little something, we've put together a small registry with some of our most wished-for items at Sining Spaces. Email hello@reallygreatsite.com with the Registry No. 12345 as the subject line for our updated gift list.
                    </p>
                    <p class="text-muted small mb-0">Thank you for being part of this milestone with us.</p>
                    
                    <!-- Copy Rekening Option -->
                    <div class="mt-3">
                        <button class="btn btn-outline-light btn-sm rounded-0" onclick="copyRekening('1234567890')">
                            <i class="fas fa-copy me-1"></i> Salin No. Rekening Bank (1234567890)
                        </button>
                    </div>
                </div>
            </div>

            <div class="dotted-line"></div>

            <!-- RSVP Section Banner -->
            <div class="d-flex flex-column flex-md-row justify-content-between align-items-center mt-5 px-md-5">
                <div class="text-center text-md-start mb-3 mb-md-0">
                    <h5 class="font-heading mb-0">PLEASE RSVP BY</h5>
                    <h4 class="font-heading text-uppercase">JULY 15, 2030</h4>
                </div>
                <div>
                    <button class="btn btn-custom px-5" data-bs-toggle="modal" data-bs-target="#rsvpModal">RSVP</button>
                </div>
            </div>
        </div>
    </section>

    <!-- RSVP MODAL -->
    <div class="modal fade" id="rsvpModal" tabindex="-1" aria-labelledby="rsvpModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content p-4">
                <div class="modal-header border-0">
                    <h5 class="modal-header-title font-heading" id="rsvpModalLabel">KONFIRMASI KEHADIRAN</h5>
                    <button type="button" class="btn-close btn-close-white" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form id="rsvpForm">
                        <div class="mb-3 text-start">
                            <label class="form-label small">Nama Lengkap</label>
                            <input type="text" class="form-control" required placeholder="Masukkan nama Anda">
                        </div>
                        <div class="mb-3 text-start">
                            <label class="form-label small">Konfirmasi Kehadiran</label>
                            <select class="form-select" required>
                                <option value="" selected disabled>Pilih Status Kehadiran</option>
                                <option value="Hadir">Ya, Saya Akan Hadir</option>
                                <option value="Tidak Hadir">Maaf, Saya Tidak Bisa Hadir</option>
                            </select>
                        </div>
                        <div class="mb-3 text-start">
                            <label class="form-label small">Jumlah Tamu</label>
                            <input type="number" class="form-control" min="1" max="2" value="1">
                        </div>
                        <div class="mb-3 text-start">
                            <label class="form-label small">Pesan / Ucapan</label>
                            <textarea class="form-control" rows="3" placeholder="Tuliskan ucapan selamat..."></textarea>
                        </div>
                        <button type="submit" class="btn btn-custom w-100 mt-3">KIRIM RSVP</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap 5 JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        // Audio Control Logic
        const audio = document.getElementById('bg-music');
        const audioBtn = document.getElementById('audioBtn');
        let isPlaying = false;

        function toggleAudio() {
            if (isPlaying) {
                audio.pause();
                audioBtn.innerHTML = '<i class="fas fa-music"></i>';
            } else {
                audio.play();
                audioBtn.innerHTML = '<i class="fas fa-pause"></i>';
            }
            isPlaying = !isPlaying;
        }

        // Auto play audio on first user touch/scroll
        window.addEventListener('click', function() {
            if (!isPlaying) {
                audio.play().then(() => {
                    isPlaying = true;
                    audioBtn.innerHTML = '<i class="fas fa-pause"></i>';
                }).catch(e => console.log("Autoplay blocked"));
            }
        }, { once: true });

        // Countdown Timer Logic
        const targetDate = new Date("August 25, 2030 00:00:00").getTime();

        function updateCountdown() {
            const now = new Date().getTime();
            const difference = targetDate - now;

            if (difference > 0) {
                const days = Math.floor(difference / (1000 * 60 * 60 * 24));
                const hours = Math.floor((difference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
                const minutes = Math.floor((difference % (1000 * 60 * 60)) / (1000 * 60));
                const seconds = Math.floor((difference % (1000 * 60)) / 1000);

                document.getElementById("days").innerText = days < 10 ? '0' + days : days;
                document.getElementById("hours").innerText = hours < 10 ? '0' + hours : hours;
                document.getElementById("minutes").innerText = minutes < 10 ? '0' + minutes : minutes;
                document.getElementById("seconds").innerText = seconds < 10 ? '0' + seconds : seconds;
            }
        }

        setInterval(updateCountdown, 1000);
        updateCountdown();

        // Copy Rekening Function
        function copyRekening(nomor) {
            navigator.clipboard.writeText(nomor);
            alert("Nomor rekening berhasil disalin: " + nomor);
        }

        // RSVP Form Submit Handler
        document.getElementById('rsvpForm').addEventListener('submit', function(e) {
            e.preventDefault();
            alert("Terima kasih! Konfirmasi RSVP Anda telah terkirim.");
            const modalElement = document.getElementById('rsvpModal');
            const modal = bootstrap.Modal.getInstance(modalElement);
            modal.hide();
            this.reset();
        });
    </script>
</body>
</html>
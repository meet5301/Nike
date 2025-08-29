<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>ShopEase</title>
  <style>
    body {
      margin: 0;
      font-family: 'Segoe UI', sans-serif;
      background-color: #f9f9f9;
    }

    header {
      background-color: #111;
      color: white;
      padding: 1rem 2rem;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    header h1 {
      margin: 0;
      font-size: 1.5rem;
    }

    nav a {
      color: white;
      margin-left: 20px;
      text-decoration: none;
    }

    .hero {
      text-align: center;
      padding: 80px 20px;
      background-color: #fff;
    }

    .hero h2 {
      font-size: 2rem;
      margin-bottom: 10px;
    }

    .products {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
      gap: 20px;
      padding: 40px 20px;
    }

    .product-card {
      background-color: #fff;
      border-radius: 10px;
      padding: 15px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
      text-align: center;
    }

    .product-card img {
      max-width: 100%;
      height: 150px;
      object-fit: contain;
      margin-bottom: 10px;
    }

    .product-card h3 {
      font-size: 1rem;
      margin: 0;
    }

    .product-card p {
      color: green;
      font-weight: bold;
    }

    footer {
      text-align: center;
      padding: 20px;
      background-color: #111;
      color: #ccc;
    }
  </style>
</head>
<body>

  <header>
    <h1>ShopEase</h1>
    <nav>
      <a href="#">Home</a>
      <a href="#">Products</a>
      <a href="#">Cart</a>
      <a href="#">Login</a>
    </nav>
  </header>

  <div class="hero">
    <h2>Welcome to ShopEase</h2>
    <p>Minimal. Fast. Affordable.</p>
  </div>

  <div class="products">
    <div class="product-card">
      <img src="https://via.placeholder.com/150" alt="Product 1">
      <h3>Wireless Headphones</h3>
      <p>$49.99</p>
    </div>
    <div class="product-card">
      <img src="https://via.placeholder.com/150" alt="Product 2">
      <h3>Smart Watch</h3>
      <p>$89.99</p>
    </div>
    <div class="product-card">
      <img src="https://via.placeholder.com/150" alt="Product 3">
      <h3>Bluetooth Speaker</h3>
      <p>$29.99</p>
    </div>
  </div>

  <footer>
    &copy; 2025 ShopEase. All rights reserved.
  </footer>

</body>
</html>

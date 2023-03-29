document.addEventListener('DOMContentLoaded', function() {
  // Crea el navbar
  const nav = document.createElement('nav');
  nav.innerHTML = `
    <ul>
      <li><a href="#">Inicio</a></li>
      <li><a href="#">Acerca de</a></li>
      <li><a href="#">Contacto</a></li>
    </ul>
  `;
  document.body.appendChild(nav);

  // Crea el sidebar
  const sidebar = document.createElement('div');
  sidebar.classList.add('sidebar');
  sidebar.innerHTML = `
    <ul>
      <li><a href="#">Opción 1</a></li>
      <li><a href="#">Opción 2</a></li>
      <li><a href="#">Opción 3</a></li>
    </ul>
  `;
  document.body.appendChild(sidebar);
});

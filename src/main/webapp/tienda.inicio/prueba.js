document.addEventListener('DOMContentLoaded', function() {
  const mensajeElemento = document.getElementById('mensaje');
  
  function conectar() {
    fetch('../com.mycompany.tienda.conexion/connectBD')
      .then(response => response.text())
      .then(data => {
        console.log(data);
        // Aquí puedes realizar cualquier otra acción con los datos recibidos del servidor
        mensajeElemento.textContent = data;
      })
      .catch(error => console.error(error));
  }
  
  conectar();
});

function showAlert() {
  var alertContainer = document.getElementById('alertContainer');
  alertContainer.style.display = 'flex';
  document.body.classList.add("no-scroll");
}

function hideAlert() {
  var alertContainer = document.getElementById('alertContainer');
  alertContainer.style.display = 'none';
  location.reload();
}
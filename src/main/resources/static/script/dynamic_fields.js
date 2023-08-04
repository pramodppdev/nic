document.addEventListener("DOMContentLoaded", () => {
  const inputContainer = document.getElementById("inputContainer");
  let inputCounter = 0;
  const maxFields = 15;

  function createInputField() {
    if (inputCounter < maxFields){
      const inputWrapper = document.createElement("div");
      inputWrapper.classList.add("input-container");

      const inputField = document.createElement("input");
      inputField.type = "text";
      inputField.name = "inputField" + inputCounter;
      inputField.placeholder = `Question ${inputCounter + 1}`;

      const checkboxLabel = document.createElement("label");
      const checkbox = document.createElement("input");
      checkboxLabel.appendChild(document.createTextNode("Image Required" ));
      checkbox.type = "checkbox";
      checkboxLabel.appendChild(checkbox);


      const deleteButton = document.createElement("button");
      deleteButton.textContent = "Delete";
      deleteButton.addEventListener("click", () => deleteInputField(inputWrapper));

      inputWrapper.appendChild(inputField);
      inputWrapper.appendChild(checkboxLabel);
      inputWrapper.appendChild(deleteButton);
      inputContainer.appendChild(inputWrapper);
      inputCounter++;
    } else {
      alert("You have reached the maximum limit of input fields (15).");
    }
  }

  function deleteInputField(inputWrapper) {
    inputContainer.removeChild(inputWrapper);
    inputCounter--;
  }

  document.getElementById("addButton").addEventListener("click", createInputField);
});
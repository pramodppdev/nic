document.addEventListener("DOMContentLoaded", () => {
    const inputContainer = document.getElementById("inputContainer");
    let inputCounter = 0;
    const maxFields = 15;

    function createInputField() {
      if (inputCounter < maxFields){
        const inputField = document.createElement("input");
      inputField.type = "text";
      inputField.name = "inputField" + inputCounter;
      inputField.placeholder = `Question ${inputCounter +1}`;

      const deleteButton = document.createElement("button");
      deleteButton.textContent = "Delete";
      deleteButton.addEventListener("click", () => deleteInputField(inputField, deleteButton));
      const inputWrapper = document.createElement("div");
      inputWrapper.appendChild(inputField);
      inputWrapper.appendChild(deleteButton);
      inputContainer.appendChild(inputWrapper);
      inputCounter++;
      }
      else {
    alert("You have reached the maximum limit of input fields (15).");
  }
    }
    function deleteInputField(inputField, deleteButton) {
      const inputWrapper = inputField.parentElement;
      inputContainer.removeChild(inputWrapper);
      inputCounter--;
    }
    document.getElementById("addButton").addEventListener("click", createInputField);
  });


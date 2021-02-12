var addButton = document.querySelector("#add-button") 
console.log(addButton)

addButton.addEventListener("click", addToDoItem); 
function addToDoItem() {
    alert("Add button clicked!!!")
}



var clearButton = document.querySelector("#clear-completed-btn") 

clearButton.addEventListener("click", clearCompletedTodos); 
function clearCompletedTodos() {
    alert("Clear button clicked!!!")
}



var emptyButton = document.querySelector("#empty-list-btn") 

emptyButton.addEventListener("click", emptyList); 
function emptyList() {
    alert("Empty list button clicked!!!")
}



var saveButton = document.querySelector("#save-btn") 

saveButton.addEventListener("click", saveItemsList); 
function saveItemsList() {
    alert("Save button clicked!!!")
}

console.log(saveButton)
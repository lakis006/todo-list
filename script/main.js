//first give some simple functions to buttons

var addButton = document.querySelector("#add-button") 
console.log(addButton)

addButton.addEventListener("click", addToDoItem); 
function addToDoItem() {
    var itemText = toDoFieldBox.value;
    newTodoItem(itemText, false)
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

// gonna work on the entry box for todo & grab ordered list 
//creating function that establishes new todo items 
var toDoFieldBox = document.querySelector("#entry-box4-todo")
var toDoList = document.querySelector("#list-todos")

function newTodoItem (textItem, completed) {
    var todoItem = document.createElement("li");
    var todoText = document.createTextNode(textItem);

    
    todoItem.appendChild(todoText);

    if (completed) {
        todoItem.classList.add("completed")
    }

    console.log(todoItem)

    toDoList.appendChild(todoItem);
    
}


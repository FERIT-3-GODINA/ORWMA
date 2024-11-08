function AddTask(){
    let list = document.getElementById("toDoList");
    let task = document.getElementById("taskToAdd").value;
    let entry = document.createElement("li");
    entry.appendChild(document.createTextNode(task));

    entry.onclick = function() {
        entry.style.textTransform = "uppercase";
        entry.style.color = "lime";
    }

    entry.onmouseover = function() {
        entry.style.cursor = "pointer";
    }
     
    let removeButton = document.createElement("button");
    removeButton.textContent = "X";
    removeButton.style.margin = "8px";
    
    removeButton.onclick = function(){
        entry.remove();
    }
    entry.appendChild(removeButton);
    list.appendChild(entry);

    removeButton.onmouseover = function() {
        entry.style.textDecoration = "line-through";
    }

    removeButton.onmouseout = function() {
        entry.style.textDecoration = "none";
    }
}

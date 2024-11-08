function Add(add){
    let firstNumber = parseFloat(document.getElementById("firstNumber").value);
    let secondNumber = parseFloat(document.getElementById("secondNumber").value);
    document.getElementById("result").innerText = firstNumber + secondNumber;
}

function Subtract(subtract){
    let firstNumber = parseFloat(document.getElementById("firstNumber").value);
    let secondNumber = parseFloat(document.getElementById("secondNumber").value);
    document.getElementById("result").innerText = firstNumber - secondNumber;
}

function Multiply(multiply){
    let firstNumber = parseFloat(document.getElementById("firstNumber").value);
    let secondNumber = parseFloat(document.getElementById("secondNumber").value);
    document.getElementById("result").innerText = firstNumber * secondNumber;
}

function Divide(divide){
    let firstNumber = parseFloat(document.getElementById("firstNumber").value);
    let secondNumber = parseFloat(document.getElementById("secondNumber").value);
    document.getElementById("result").innerText = firstNumber / secondNumber;
}

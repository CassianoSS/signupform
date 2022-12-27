(function () {
    "use strict"
    let form = document.getElementById("customform");
    let input = document.getElementById("NIF");
    let element = document.getElementById("notify");
    element.style.display = "none";
    input.addEventListener('invalid', function (event) {
        event.preventDefault();
        if (event.target.validity.valueMissing) {
            element.textContent = "Campo vazio. Favor insira seu NIF."
            element.className = 'error';
            element.style.display = 'block';
            input.className = 'invalid';
        }
        else if (!event.target.validity.valid) {
            element.textContent = 'NIF inválido. Por favor introduza um NIF válido com 9 dígitos.';
            element.className = 'error';
            element.style.display = 'block';
            input.className = 'invalid';
        }

    });

    input.addEventListener('input', function (event) {
        if ('block' === element.style.display) {
            input.className = '';
            element.style.display = 'none';
        }
    });

    form.addEventListener('submit', function (event) {
        event.preventDefault();
        alert("Cadastro Conlcuido!");
    });
})();
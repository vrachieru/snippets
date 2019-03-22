let configureLogging = () => {
    console.log_default = typeof console !== 'undefined' && typeof console.log !== 'undefined' ? console.log : () => {};
    console.log_inpage = (...arguments) => {
        let element = document.getElementById('log');
        let timestamp = new Date().toLocaleTimeString();
        let message = arguments
                .filter(it => typeof it === 'string' && !it.startsWith('color:'))
                .map(it => typeof it === 'string' ?it.replace(/%c/g, '') : it)
                .join(' ');

        element.value += timestamp + ': ' + message + '\n';
        element.scrollTop = element.scrollHeight;
    }

    console.log = (...arguments) => { console.log_default(...arguments); console.log_inpage(...arguments) };
    console.error = console.debug = console.info = console.log;
}
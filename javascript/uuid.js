let generateUuid = () => {
    let timestamp = new Date().getTime();
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (placeholder) {
        let char = (timestamp + Math.random() * 16) % 16 | 0;
        timestamp = Math.floor(timestamp / 16);
        return (placeholder == 'x' ? char : (char & 0x3 | 0x8)).toString(16);
    });
}
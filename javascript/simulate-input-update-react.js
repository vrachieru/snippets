let setNativeValue = (element, value) => {
    let lastValue = element.value;
    element.value = value;
    let event = new Event('input', { target: element, bubbles: true });
    event.simulated = true; // React 15
    element._valueTracker && element._valueTracker.setValue(lastValue); // React 16
    element.dispatchEvent(event);
}
let sleep = (seconds) => { return new Promise(resolve => setTimeout(resolve, seconds * 1000)) }

// let task = async () => {
//     await sleep(1);
//     console.log('1 second passed');
// }
//
// task();
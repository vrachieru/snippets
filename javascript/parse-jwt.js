let parseJWT = (token) => {
    let parse = (str) => JSON.parse(atob(str.replace(/-/g, '+').replace(/_/g, '/')));
    let chunks = token.split('.'); // token = header.payload.signature

    return jwt = {
        header: parse(chunks[0]),
        payload: parse(chunks[1]),
        signature: chunks[2],
    }
}
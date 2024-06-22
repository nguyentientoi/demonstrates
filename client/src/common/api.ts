export const fetchData = async (url: string, method: string, data: any): Promise<any> => {
    const response = await fetch(url, {
        method: method,
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
    });
    if (!response.ok) {
        throw new Error(response.statusText);
    }
    return response.json() as Promise<any>;
}
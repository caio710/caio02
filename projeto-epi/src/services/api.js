import axios from "axios";

constapi = axios.create({
    baseURL: "http://localhost:8080",
    timeout: 50000,
});

export default api;
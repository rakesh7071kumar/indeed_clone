import axios from 'axios';


const API_URL = "http://localhost:9000";

export const savePost = async (payload) => {
    try{
        return await axios.post(`${API_URL}/saveJobDetails`,payload);
    }catch(error){
        console.log("Error: ", error.message);
        return error.response.data;
    }
    
}


export const getAllPosts = async() =>{
    try{
        return await axios.get(`${API_URL}/getAllJobs`);
    }catch(error){
        console.log("Error: ", error.message);
        return error.response.data;
    }
}

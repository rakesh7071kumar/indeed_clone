import Header from "../components/Header";
import { useEffect, useState } from "react";
import { getAllPosts } from "../service/api";
import { Box,InputBase,Typography, Card, CardContent, styled } from "@mui/material";



const SearchWrapper = styled(Box)({
    marginTop: 74,
    display: 'flex',
    justifyContent:'center',
    '& > div' :{
        height: 45,
        width: 400,
        border: '1px solid #767676',
        borderRadius: 10,
        display: 'flex',
        alignItems: 'center',
        paddingLeft:5
    }
})

const PostWrapper = styled(Box)({
    display:'flex',
    justifyContent:'center',
    marginTop:10,
    flexWrap:'wrap',
    '& > div' :{
        margin: 10,
        width:'30%',
        height:200

    }



    })

const AllPost = () =>{

    const[posts,setPosts] = useState([]);
    const[text,setText] = useState("");

    useEffect(() => {
        const getData = async() =>{
          const response = await getAllPosts();
          setPosts(response.data);
          //data will be returned by axios
        }
        getData();
    },[])



    return(
        <>
            <Header />
            <SearchWrapper>
                <InputBase 
                    placeholder="Seach by job Title"
                    onChange={(e) => setText(e.target.value)}
                />

            </SearchWrapper>
            <PostWrapper>
                {
                    posts.filter(post => post.profile.toLowerCase().includes(text.toLowerCase())).map(post=>(
                       <Card>
                        <CardContent>
                            <Typography variant="h5">{post.profile}</Typography>
                            <Typography><b>Job Type :</b>{post.type === 'Online' ? 'remote' : 'Office'}</Typography>
                            <Typography><b>Description :</b>{post.description}</Typography>
                            <Typography><b>Experinece :</b>{post.experience}</Typography>
                            <Typography><b>Technology :</b>{post.technology}</Typography>
                            <Typography><b>Salary :</b>{post.salary}</Typography>
                        </CardContent>
                       </Card>


                    ))
                }
            </PostWrapper>
            
        </>
    )
}

export default AllPost;
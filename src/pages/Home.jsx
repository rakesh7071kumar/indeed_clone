import Header from "../components/Header";
import {Box, Typography, Button, styled} from '@mui/material';
import {useNavigate} from "react-router-dom";
import { routePath } from "../routes/route";



const Component = styled(Box)({
    display:'flex',
    height:'100vh',
    alignItems:'center',
    margin:'0 180px',
    '& > div' :{
        width:'50%',
        display:'flex',
        flexDirection:'column',
        justifyContent:'center',
        '& > p' :{
            fontSize: 48,
            lineHeight: 1.25,
            letterSpacing:-1
        },'& > button' :{
            marginTop:50,
            width:150,
            height:50,
            textTransform:'none',
            fontWeight:700
        }
        

    }
})



const Home = () =>{

    const navigate = useNavigate();


    const anime="https://images.ctfassets.net/pdf29us7flmy/5r34jiS1YfJuoRzqp3XH6y/6fba6547e16cd0ad08ae28dad306015d/Screen_Shot_2023-01-11_at_9.21.31_AM.png?w=720&q=100&fm=avif";
    return(
        <>
        <Header />
        {/* box is noting but div in material ui */}
        {/* Typograpthy is replacement of p tag */}
        <Component>
            <Box>
                <Typography>Let's make your next<br/> great hire. Fast.</Typography>
                <Button variant="contained" onClick={ () => navigate(routePath.create)       }>Post a job</Button>
            </Box>
            <Box>
                <img src={anime} alt="image" style={{width:500}}/>
            </Box>
        </Component>
        </>
    )
}

export default Home
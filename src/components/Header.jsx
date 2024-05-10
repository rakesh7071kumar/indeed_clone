import {AppBar,Toolbar,styled} from '@mui/material'
import {Link} from 'react-router-dom';
import { routePath } from '../routes/route';


//styles
const StyledAppBar = styled(AppBar)({
    backgroundColor:'black',
    height:64,
    '& > div > *' :{
        textDecoration:'none',
        color:'inherit',
        marginRight: 20,
        fontSize: 14
    }
})

const Header = () => {
    //it's the logo on header
    const logo="https://get-staffed.com/wp-content/uploads/2020/07/indeed-logo.png";
    //  Toolbar and all are materialui components to get the header
    return(
        <StyledAppBar>
            <Toolbar>
                <Link to={routePath.home}>
                     <img src={logo} alt='indeed' style={{width:95, marginBottom:6}} />
                </Link>
                <Link to={ routePath.create }>Post a job</Link>
                <Link to={ routePath.posts }>Find a job</Link>
            </Toolbar>
        </StyledAppBar>
    )
}

export default Header;
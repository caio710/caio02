import './styles.css';
import { Link } from 'react-router-dom';

export default function Header(params){
    return(
        <header className="header">
            <div className='container'>
                <link to="/">Senai</link>
                <nav>
                    <Link to="/cadastro">cadastro</Link>
                    <Link to="/usuario">listar usuario</Link>
                </nav>

            </div>
        </header>
    );
}
import '.styles.css';

export default function Footer(params) {
    const anoAtual = new Date().getFullYear();
    return (
        <footer className="footer">
            <p>© {anoAtual} Todos os direitos reservados.</p>
        </footer>
    );
}
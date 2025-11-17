import { use } from 'react';
import './styles.css';

const esquemacadastro = yup.object(
    {
        nome: yup.string().required("O nome é obrigatório").min(3, "O nome deve ter no mínimo 3 caracteres"),
        email: yup.string().required("O email é obrigatório").email("Digite um email válido"),
        senha: yup.string().required("A senha é obrigatória").min(6, "A senha deve ter no mínimo 6 caracteres"),
        confirmarSenha: yup.string().required("A confirmação de senha é obrigatória")
            .oneOf([yup.ref('senha'), null], "As senhas devem coincidir")
    })
   export default function CadastroPage(params){
    const{
        register:registrarCampo,
        handleSubmit:manipularEnvio,
        formState:{errors:errosFormulario},
        setError:definirErroNoCampo,
        reset:limparCamposDoFormulario,
    } = useForm({
        resolver:yupResolver(esquemacadastro),
        defaultValues:{
            nome:'',
            email:'',
            senha:'',
            confirmarSenha:'',
        },
    });
   }
    async function onSubmit(dadosDoFormulario){

    
        const dadosApi = {
            nome: dadosDoFormulario.nome,
            email: dadosDoFormulario.email,
            senha: dadosDoFormulario.senha,
        };
        try{
            const resposta = await api.post('/usuarios', dadosApi);
    }
}
     return(

     )

    

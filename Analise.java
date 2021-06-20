/*===============================================================
  Ficheiro: Analise.java                               
  Autor: Edson Paulo Gregório               
  ID: 1000020974 
  Disciplina: Sistemas Distribuídos e Paralelos I 
  Orientador: Dr. Aires Manuel Araujo Veloso  
  Data: 19-06-2021   
  Descrição: E-Commerce - Sistema de venda de materiais escolar      
*================================================================*/                       

/*
1 - Definicao do Problema

 1.1 - Implementar um sistema de venda de uma Loja de Equipamentos Agrícolas, com as seguintes funcionalidades:
 

  --- Gestão de Funcionários
	--- Criar
	--- Visualizar

  --- Gestão de Clientes  
	--- Criar
	--- Visualizar

  --- Gestão de Produtos  
	--- Criar
	--- Definir Precos
	--- Visualizar

  --- Gestão de Fornecedor  
	--- Criar

  --- Gestão de Provincias  
	--- Criar
	--- Visualizar

  --- Gestão de Municipios  
	--- Criar
	--- Visualizar
	

  --- Gestão de Categorias  
	--- Criar
	--- Visualizar
	
  --- Gestão de Marcas de Produtos  
	--- Criar
	--- Visualizar

  --- Gestão de Modalidades Desportivas  
	--- Criar
	--- Visualizar

  --- Gestão de Produtos na Montra  
	--- Criar
	--- Visualizar
  
2 - Analise
 2.1 - Interface com o Utilizador (IU)
 
  Apresentacao
    Aceito os termos de uso do programa
    Concordo --> continuar com a visualizacao da pagina
    Discordo --> terminar a visualizacao da pagina
  FimApresentacao
   
  Login
    Username
    PassWord
  FimLogin
  
  Home

  Menus:
	*Menu Cliente (nao cadastrado) 
		* Home
		* Montra
		* Sobre Nós

	*Menu Cliente (cliente cadastrado)
		* Home
		* Montra
		* Sobre Nós
	
	*Menu Funcionario
		* Home
		* Clientes
		* Produtos
		* Gestao
			* Precos
			* Categorias
			* Marcas
			* Modalidades

	*Menu Admin
		* Home
		* Funcionarios
		* Clientes
		* Produtos
		* Compras
		* Gestao
			*Paises
			* Provincias
			* Municipios 
			* Precos
			* Categorias
			* Marcas
			* Modalidades

	*Menu Root
		* Home
		* Montra
		* Funcionarios
		* Clientes
		* Produtos
		* Compras
		* Gestao
			* Contas 
			* Paises
			* Provincias
			* Municipios 
			* Precos
			* Categorias
			* Marcas
			* Modalidades

   
 2.2 - Identificacao das principais Entidades Ligadas IU


  --- Entidade Funcionario

    Atributo Codigo                               : (int)   
    Atributo Nome                                 : (String)  
    Atributo Sobrenome                            : (String)
    Atributo NumeroBI                             : (String)	
    Atributo Sexo                                 : (String)
    Atributo EstadoCivil                          : (String)
    Atributo DataNascimento                       : (Calendar)     
    Atributo DataCadastro                         : (Calendar)
    Atributo Telefone                             : (TelefoneModelo)
    Atributo Email                                : (EmailModelo)
    Atributo Endereco                             : (EnderecoModelo)
     

  --- Entidade Cliente

    Atributo Codigo                               : (int)   
    Atributo Nome                                 : (String)  
    Atributo Sobrenome                            : (String)
    Atributo NumeroBI                             : (String)	
    Atributo Sexo                                 : (String)
    Atributo EstadoCivil                          : (String)
    Atributo DataNascimento                       : (Calendar)     
    Atributo DataCadastro                         : (Calendar)
    Atributo Telefone                             : (TelefoneModelo)
    Atributo Email                                : (EmailModelo)
    Atributo Endereco                             : (EnderecoModelo)

  --- Entidade Cliente

    	Atributo Codigo                               : (int)   
    	Atributo Nome                                 : (String)  
 
  --- Entidade CarrinhoCompra

    Atributo Codigo                               : (int) 
    Atributo Cliente                              : (ClienteModelo)  
    Atributo TipoCartao                           : (TipoCompraModelo)
    Atributo DataCompra                           : (Calendar) 
    Atributo Total                                : (float)
    Atributo ItensCompra                          : (ArrayList<ItensCompraModelo>)

         
    --- Entidade Montra

    Atributo Codigo                               : (int)
    Atributo Produto                              : (ProdutoModelo)  

    --- Entidade Conta

    Atributo Codigo                               : (int)
    Atributo Username                             : (String)
    Atributo Password                             : (String)  
    Atributo Privilegio                           : (PrivilegioModelo)  
 
3. Desenho
   Algoritmo  
   { 
    Formulario_Apresentacao_Termos_Licenca() 
    Opcao =  { Concordo, Discordo} 
    
    se opcao == Discordo 
       abortar programa 
      senao 
       Login()  
    
   } 
   
    
4. Implementacao
     
   # Implementado Em Java Web (JSP e Servlets)
  
 
5. Debugging(Depuracao) 
     
 
6. Documentacao 
  
   # Manual OnLine do Java (API) JSE e JEE
    
7. Entrega ao Cliente 
   
   Entregue Ao Prof. Doutor. Eng. Aires Manuel Araujo Veloso 
 
*/    

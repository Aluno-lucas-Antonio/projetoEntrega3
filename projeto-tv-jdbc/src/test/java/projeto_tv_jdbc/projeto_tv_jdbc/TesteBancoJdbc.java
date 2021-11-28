package projeto_tv_jdbc.projeto_tv_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.ClasseDAO;
import model.Configuracao;
import model.Televisao;

public class TesteBancoJdbc {
	
	/*@Test
	public void initBanco() {
		SingleConnection.getConnetion();
	}*/
	
	/*@Test
	
	public void initBanco() {
		Televisao televisao = new Televisao ();
		ClasseDAO classeDao = new ClasseDAO ();

		classeDao.salvar(televisao);
		
		televisao.setId("10000");
		televisao.setMarca("Philco");
		televisao.setModelo("avz2");
		
		classeDao.salvar(televisao);
	}
	
	@Test
	public void initListar() {
		try {
			ClasseDAO classeDao = new ClasseDAO();
			List<Televisao> list = classeDao.listar();
			
			for(Televisao televisao : list) {
				System.out.println(televisao.toString());
				System.out.println("----------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void initBuscar() {
		try {
			ClasseDAO classeDao = new ClasseDAO();
			Televisao televisao = classeDao.buscar(4L);
			
			System.out.println(televisao.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void initAtualizar () {
		
		try {
			ClasseDAO classeDao = new ClasseDAO();
			Televisao televisao = classeDao.buscar(5L);
			
			televisao.setMarca("Sansung");
			
			classeDao.atualizar(televisao);
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	@Test
	public void initDeletar() {
		try {
			ClasseDAO classeDao = new ClasseDAO();
			classeDao.deletar(7L);
					
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void salvarTelevisao() {
		Televisao televisao = new Televisao();
		ClasseDAO classeDAO = new ClasseDAO();
		televisao.setId(1,2);
		televisao.setMarca("comercial");
		televisao.setModelo("tela Plana");
		
		classeDAO.salvar(televisao);
	}
	@Test
	public void initListarTelevisao() {
		try {
			ClasseDAO classeDao = new ClasseDAO();
			List<Televisao> list = classeDao.listar();
			
			for(Televisao televisao : list) {
				System.out.println(televisao.toString());
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void initDeletarCascata() {
		try {
			ClasseDAO classeDao = new ClasseDAO();
			classeDao.deletarCascata(10L);
					
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}*/
	
@Test
	
	public void initBanco() {
		Configuracao configuracao = new Configuracao ();
		ClasseDAO classeDao = new ClasseDAO ();

		classeDao.salvar(configuracao);
		
		configuracao.setEmail("pintod@gmail.com");
		configuracao.setSenha("s2e3r4");
		configuracao.setNomeUsuario("avz2");
		
		//classeDao.salvar(configuracao);
	}
@Test
public void initListar() {
	try {
		ClasseDAO classeDao = new ClasseDAO();
		List<Configuracao> list = classeDao.listar();
		
		for(Configuracao configuracao : list) {
			System.out.println(configuracao.toString());
			System.out.println("----------------");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}	
}

@Test
public void initBuscar() {
	try {
		ClasseDAO classeDao = new ClasseDAO();
		Configuracao configuracao = classeDao.buscar(4L);
		
		System.out.println(configuracao.toString());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Test
public void initAtualizar () {
	
	try {
		ClasseDAO classeDao = new ClasseDAO();
		Configuracao configuracao = classeDao.buscar(5L);
		
		configuracao.setEmail("pintod@gmail.com");
		
		classeDao.atualizar(configuracao);
	} catch (Exception e) {
		
		e.printStackTrace();
	}	
}

@Test
public void initDeletar() {
	try {
		ClasseDAO classeDao = new ClasseDAO();
		classeDao.deletar(7l);
				
	} catch (Exception e) {
		e.printStackTrace();
	}	
}

@Test
public void salvarTelevisao() {
	Configuracao configuracao = new Configuracao();
	ClasseDAO classeDAO = new ClasseDAO();
	configuracao.setEmail("pintod@gmail.com");
	configuracao.setNomeUsuario("luizinho");
	configuracao.setSenha("telaPlana");
	
	classeDAO.salvar(configuracao);
}
@Test
public void initListarTelevisao() {
	try {
		ClasseDAO classeDao = new ClasseDAO();
		List<Configuracao> list = classeDao.listar();
		
		for(Configuracao configuracao : list) {
			System.out.println(configuracao.toString());
			System.out.println("--------------------------------------");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}	
}

@Test
public void initDeletarCascata() {
	try {
		ClasseDAO classeDao = new ClasseDAO();
		classeDao.deletarCascata(10L);
				
	} catch (Exception e) {
		e.printStackTrace();
	}	
}

	
	
	
	
	
	
	
	
	
	
}

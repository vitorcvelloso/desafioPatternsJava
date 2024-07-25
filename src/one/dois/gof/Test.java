package one.dois.gof;

import one.dois.gof.facade.Facade;
import one.dois.gof.singleton.SingletonEager;
import one.dois.gof.singleton.SingletonLazy;
import one.dois.gof.singleton.SingletonLazyHolder;
import one.dois.gof.strategy.Comportamento;
import one.dois.gof.strategy.ComportamentoAgressivo;
import one.dois.gof.strategy.ComportamentoDefensivo;
import one.dois.gof.strategy.ComportamentoNormal;
import one.dois.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}

package kr.or.ddit.shop.service.prod;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.shop.vo.prod.ProdVO;

public class DisplayProdServiceImpl extends UnicastRemoteObject implements IDisplayProdService {


	protected DisplayProdServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ProdVO> sortBySold() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdVO> sortByNew() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdVO> sortByEcpensive() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdVO> sortBySheap() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

package kr.or.ddit.shop.service.prod;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.prod.ProdVO;

public interface IDisplayProdService extends Remote {

	public List<ProdVO> sortBySold() throws RemoteException;
	public List<ProdVO> sortByNew() throws RemoteException;
	public List<ProdVO> sortByEcpensive() throws RemoteException;
	public List<ProdVO> sortBySheap() throws RemoteException;
}

package iot.rmi;

import java.rmi.*;

public interface RMIInterface extends Remote{
	public Boolean isConnected(String deviceID) throws RemoteException;
}

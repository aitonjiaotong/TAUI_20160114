package cn.com.aiton.utils;

/**
 * Created by Administrator on 14-2-16.
 */
import java.io.IOException;

//import org.snmp4j.CommunityTarget;
//import org.snmp4j.PDU;
//import org.snmp4j.Snmp;
//import org.snmp4j.TransportMapping;
//import org.snmp4j.event.ResponseEvent;
//import org.snmp4j.mp.SnmpConstants;
//import org.snmp4j.smi.Integer32;
//import org.snmp4j.smi.Null;
//import org.snmp4j.smi.OID;
//import org.snmp4j.smi.VariableBinding;
//import org.snmp4j.transport.DefaultUdpTransportMapping;

public class SnmpWalk {
//    private static int version = SnmpConstants.version1;
//    private static String protocol = "udp";
//    private static int port = 161;
//
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        String ip = "192.168.8.254";
//        String community = "public";
//        String targetOid = "1.3.6.1.2.1.2.2.1.2";
//        SnmpWalk tester = new SnmpWalk();
//        tester.snmpWalk(ip, community, targetOid);
//
//    }
//
//    /**
//     * 1)responsePDU == null<br>
//     * 2)responsePDU.getErrorStatus() != 0<br>
//     * 3)responsePDU.get(0).getOid() == null<br>
//     * 4)responsePDU.get(0).getOid().size() < targetOID.size()<br>
//     * 5)targetOID.leftMostCompare(targetOID.size(),responsePDU.get(0).getOid())!=0<br>
//     * 6)Null.isExceptionSyntax(responsePDU.get(0).getVariable().getSyntax())<br>
//     * 7)responsePDU.get(0).getOid().compareTo(targetOID) <= 0<br>
//     * @param ipAddress
//     * @param community
//     * @param oid
//     */
//    @SuppressWarnings("unused")
//    private void snmpWalk(String ip, String community, String targetOid) {
//        String address = protocol + ":" + ip + "/" + port;
//
//        OID targetOID = new OID(targetOid);
//
//        PDU requestPDU = new PDU();
//        requestPDU.setType(PDU.GETNEXT);
//        requestPDU.add(new VariableBinding(targetOID));
//
//        CommunityTarget target = SnmpUtil.createCommunityTarget(address,
//                community, version, 2 * 1000L, 3);
//        TransportMapping transport = null;
//        Snmp snmp = null;
//        try {
//            transport = new DefaultUdpTransportMapping();
//            snmp = new Snmp(transport);
//            transport.listen();
//
//            boolean finished = false;
//            while (!finished) {
//                VariableBinding vb = null;
//                ResponseEvent response = snmp.send(requestPDU, target);
//                PDU responsePDU = response.getResponse();
//
//                if (null == responsePDU) {
//                    System.out.println("responsePDU == null");
//                    finished = true;
//                    break;
//                } else {
//                    vb = responsePDU.get(0);
//                }
//                // check finish
//                finished = checkWalkFinished(targetOID, responsePDU, vb);
//                if (!finished) {
//                    // Dump response.
//                    System.out.println("----"+vb.toString());
//                    System.out.println("----"+vb.getOid().toString());
//                    System.out.println("----"+vb.getVariable().toString());
//
//                    // Set up the variable binding for the next entry.
//                    requestPDU.setRequestID(new Integer32(0));
//                    requestPDU.set(0, vb);
//                }
//            }
//            System.out.println("success finish snmp walk!");
//        } catch (Exception e) {
//            System.out.println("SNMP walk Exception: " + e);
//        } finally {
//            if (snmp != null) {
//                try {
//                    snmp.close();
//                } catch (IOException ex1) {
//                    snmp = null;
//                }
//            }
//            if (transport != null) {
//                try {
//                    transport.close();
//                } catch (IOException ex2) {
//                    transport = null;
//                }
//            }
//        }
//
//    }
//
//    /**
//     * check snmp walk finish
//     * @param resquestPDU
//     * @param targetOID
//     * @param responsePDU
//     * @param vb
//     * @return
//     */
//    private boolean checkWalkFinished(OID targetOID, PDU responsePDU,
//                                      VariableBinding vb) {
//        boolean finished = false;
//        if (responsePDU.getErrorStatus() != 0) {
//            System.out.println("responsePDU.getErrorStatus() != 0 ");
//            System.out.println(responsePDU.getErrorStatusText());
//            finished = true;
//        } else if (vb.getOid() == null) {
//            System.out.println("vb.getOid() == null");
//            finished = true;
//        } else if (vb.getOid().size() < targetOID.size()) {
//            System.out.println("vb.getOid().size() < targetOID.size()");
//            finished = true;
//        } else if (targetOID.leftMostCompare(targetOID.size(), vb.getOid()) != 0) {
//            System.out.println("targetOID.leftMostCompare() != 0");
//            finished = true;
//        } else if (Null.isExceptionSyntax(vb.getVariable().getSyntax())) {
//            System.out
//                    .println("Null.isExceptionSyntax(vb.getVariable().getSyntax())");
//            finished = true;
//        } else if (vb.getOid().compareTo(targetOID) <= 0) {
//            System.out.println("Variable received is not "
//                    + "lexicographic successor of requested " + "one:");
//            System.out.println(vb.toString() + " <= " + targetOID);
//            finished = true;
//        }
//        return finished;
//
//    }
}

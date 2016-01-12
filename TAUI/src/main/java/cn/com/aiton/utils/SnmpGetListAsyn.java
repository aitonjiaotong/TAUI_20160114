package cn.com.aiton.utils;

/**
 * Created by Administrator on 14-2-16.
 */
import java.util.ArrayList;
import java.util.List;


//import org.snmp4j.CommunityTarget;
//import org.snmp4j.MessageDispatcherImpl;
//import org.snmp4j.PDU;
//import org.snmp4j.Snmp;
//import org.snmp4j.event.ResponseEvent;
//import org.snmp4j.event.ResponseListener;
//import org.snmp4j.mp.MPv1;
//import org.snmp4j.mp.MPv2c;
//import org.snmp4j.mp.MPv3;
//import org.snmp4j.mp.SnmpConstants;
//import org.snmp4j.smi.OID;
//import org.snmp4j.smi.VariableBinding;
//import org.snmp4j.transport.DefaultUdpTransportMapping;
//import org.snmp4j.util.MultiThreadedMessageDispatcher;
//import org.snmp4j.util.ThreadPool;
//import org.snmp4j.util.WorkerPool;

public class SnmpGetListAsyn {
//    private static int version = SnmpConstants.version1;
//    private static String protocol = "udp";
//    private static int port = 161;
//
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//
//        String ip = "192.168.8.254";
//        String community = "public";
//        SnmpGetListAsyn tester = new SnmpGetListAsyn();
//        List<String> oidList = new ArrayList<String>();
//        oidList.add(".1.3.6.1.2.1.1.1.0");
//        oidList.add(".1.3.6.1.2.1.1.3.0");
//        oidList.add(".1.3.6.1.2.1.1.5.0");
//        // asynchronous
//        tester.snmpAsynGet(ip, community, oidList);
//
//    }
//
//    /**
//     *
//     * @param ipAddress
//     * @param community
//     * @param oidList
//     */
//    private void snmpAsynGet(String ipAddress, String community,
//                             List<String> oidList) {
//        String address = protocol + ":" + ipAddress + "/" + port;
//        CommunityTarget target = SnmpUtil.createCommunityTarget(address,
//                community, version, 2 * 1000L, 3);
//        DefaultUdpTransportMapping transport = null;
//        Snmp snmp = null;
//        try {
//            WorkerPool threadPool = ThreadPool.create("TestSNMPWorkPool", 2);
//            MultiThreadedMessageDispatcher dispatcher = new MultiThreadedMessageDispatcher(
//                    threadPool, new MessageDispatcherImpl());
//            transport = new DefaultUdpTransportMapping();
//            snmp = new Snmp(dispatcher, transport);
//            snmp.getMessageDispatcher().addMessageProcessingModel(new MPv1());
//            snmp.getMessageDispatcher().addMessageProcessingModel(new MPv2c());
//            snmp.getMessageDispatcher().addMessageProcessingModel(new MPv3());
//            snmp.listen();
//
//            PDU pdu = new PDU();
//            pdu.setType(PDU.GET);
//            for (String oid : oidList) {
//                pdu.add(new VariableBinding(new OID(oid)));
//            }
//
//            ResponseListener listener = new ResponseListener() {
//                public void onResponse(ResponseEvent event) {
//                    ((Snmp) event.getSource()).cancel(event.getRequest(), this);
//                    PDU response = event.getResponse();
//                    PDU request = event.getRequest();
//                    System.out.println("[request]:" + request);
//                    if (response == null) {
//                        System.out.println("[ERROR]: response is null");
//                    } else if (response.getErrorStatus() != 0) {
//                        System.out.println("[ERROR]: response status"
//                                + response.getErrorStatus() + " Text:"
//                                + response.getErrorStatusText());
//                    } else {
//                        System.out.println("Received response Success!!!");
//                        for (int i = 0; i < response.size(); i++) {
//                            VariableBinding vb = response.get(i);
//                            System.out.println(vb);
//                        }
//
//                    }
//                }
//            };
//
//            snmp.send(pdu, target, null, listener);
//
//            System.out.println("asynchronous send pdu wait for response...");
//        } catch (Exception e) {
//            System.out.println("SNMP GetNext Exception:" + e);
//        }
//
//    }
}

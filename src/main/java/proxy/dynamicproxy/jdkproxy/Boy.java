/********************************************
 * 文件名称: Boy.java
 * 系统名称: xRiskPlus 市场风险管理系统V5.0
 * 模块名称: 
 * 软件版权: 衡泰软件有限公司
 * 功能说明: 
 * 系统版本: 5.0.0.1
 * 开发人员: an.lv
 * 开发时间: 2019/5/6 22:40
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 
 程序版本		修改日期		修改人员		修改单编号		修改说明
 *********************************************/
package proxy.dynamicproxy.jdkproxy;

public class Boy implements Person {
    public void findLove() {
        System.out.println("身高 160 cm");
        System.out.println("体重 45 kg");
        System.out.println("肤白貌美！");
    }

    public void findJob() {
        System.out.println("互联网公司");
        System.out.println("高薪");
        System.out.println("开发岗位");
    }
}

package com.wa.utils;

/**
 * Created by zgeorg03 on 11/5/16.
 */
public class Path {
    private  final Web WebInstance = new Web();
    private  final Template TemplateInstance = new Template();

    public Template getTemplateInstance() {
        return TemplateInstance;
    }


    /**
     * Routes
     */
    public  class Web{

        private  final String INDEX = "/";

        private  final String HOTLINE = "/hotline";

        private  final String HOTLINEFORM = "/hotline/report";
        private  final String HOTLINEFORMSUBMIT = "/hotline/report";

        private  final String HELPLINE = "/helpline";

        private  final String CHAT = "/chat";

        public String getINDEX() {
            return INDEX;
        }

        public String getHOTLINE() {
            return HOTLINE;
        }

        public String getHELPLINE() {
            return HELPLINE;
        }

        public String getCHAT() {
            return CHAT;
        }

        public String getHOTLINEFORM() {
            return HOTLINEFORM;
        }

        public String getHOTLINEFORMSUBMIT() {
            return HOTLINEFORMSUBMIT;
        }

    }

    public  class Template{
        private  final String INDEX = "index/index.ftl";

        private  final String HOTLINE = "hotline/hotline.ftl";
        private  final String HOTLINEREPORT = "hotline/hotlineForm.ftl";

        private  final String SUCCESSFULSUBMIT = "/hotline/successfulSubmission.ftl";

        private  final String HELPLINE = "helpline/helpline.ftl";

        private  final String CHAT = "chat/chat.ftl";


        public  String getINDEX() {
            return INDEX;
        }

        public String getHOTLINE() {
            return HOTLINE;
        }

        public String getHELPLINE() {
            return HELPLINE;
        }

        public String getCHAT() {
            return CHAT;
        }

        public String getHOTLINEREPORT() {
            return HOTLINEREPORT;
        }

        public String getSUCCESSFULSUBMIT() {
            return SUCCESSFULSUBMIT;
        }
    }

    public  Web getWebInstance() {
        return WebInstance;
    }
}
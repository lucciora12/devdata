package kr.co.javaspecialist.my_page.controller;

import kr.co.javaspecialist.common.controller.CommandHandler;
import kr.co.javaspecialist.member.model.IMemberDAO;
import kr.co.javaspecialist.member.model.MemberDAO;

public abstract class MemberController implements CommandHandler {

	IMemberDAO dao = new MemberDAO();

}

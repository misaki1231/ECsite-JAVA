
package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
	public String execute() {
		return SUCCESS; // excecuteメソッドを実行したのち"SUCCESS"を返す
	}
}
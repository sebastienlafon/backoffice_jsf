/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//L'annotation @ManagedBean permet de déclarer un nouveau bean appelé ici LoginBean,
package greta.speedymarket.beans;
import javax.faces.bean.ManagedBean;
@ManagedBean(name="LoginBean")
public class LoginBean {
 private String login = "";
 private String password = "";
 public String getLogin() {
 return login;
 }
 public void setLogin(String login) {
 this.login = login;
 }
 public String getPassword() {
 return password;
 }

 public void setPassword(String password) {

 this.password = password;

 }

 

}
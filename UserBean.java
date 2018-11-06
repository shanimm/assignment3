/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


/**
 *
 * @author shani
 */
 public class UserBean {
	
      private String username;
      private String password;

    /**
     *
     */
    public boolean valid;
	
    /**
     *
     * @return
     */
    public String getPassword() {
         return password;
	}

    /**
     *
     * @param newPassword
     */
    public void setPassword(String newPassword) {
         password = newPassword;
	}
	
    /**
     *
     * @return
     */
    public String getUserName() {
         return username;
			}

    /**
     *
     * @param newUsername
     */
    public void setUserName(String newUsername) {
         username = newUsername;
			}

    /**
     *
     * @return
     */
    public boolean isValid() {
         return valid;
	}

    /**
     *
     * @param newValid
     */
    public void setValid(boolean newValid) {
         valid = newValid;
	}	
}

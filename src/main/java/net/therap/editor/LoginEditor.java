package net.therap.editor;

import net.therap.command.Login;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * @author safat
 * @since 12/23/16
 */
public class LoginEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        if (getValue() == null) {
            return null;
        }

        Login login = (Login) getValue();

        return String.valueOf(login.getId());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        long id;

        try {
            id = Long.parseLong(text);
            setValue(new Login(id));
        } catch (NumberFormatException nfe) {
            setValue(null);
        }


    }
}

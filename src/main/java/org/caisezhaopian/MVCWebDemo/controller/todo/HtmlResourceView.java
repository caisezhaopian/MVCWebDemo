package org.caisezhaopian.MVCWebDemo.controller.todo;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.InternalResourceView;

public class HtmlResourceView extends InternalResourceView{
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(this.getServletContext().getRealPath("/")+getUrl());
        return file.exists();
    }
}
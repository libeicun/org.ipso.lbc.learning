/*
 * 版权所有 (c) 2015 。 李倍存 （iPso）。
 * 所有者对该文件所包含的代码的正确性、执行效率等任何方面不作任何保证。
 * 所有个人和组织均可不受约束地将该文件所包含的代码用于非商业用途。若需要将其用于商业软件的开发，请首先联系所有者以取得许可。
 */

package org.ipso.lbc.learning.interpretor.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * 李倍存 创建于 2015-03-01 21:34。电邮 1174751315@qq.com。
 */
public class Context {
    public Context() {
    }

    private Map<String, Boolean> variables = new HashMap<String, Boolean>();

    public void assign(String varName, Boolean value) {
        if (variables.get(varName) != null)
            variables.remove(varName);
        variables.put(varName, value);
    }

    public Boolean getValue(String varName) {
        return variables.get(varName);
    }
}

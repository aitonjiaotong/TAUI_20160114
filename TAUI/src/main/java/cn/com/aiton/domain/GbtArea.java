package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

/**
 * Created by Administrator on 14-11-14.
 */

@Table(name = "GbtArea")
public class GbtArea {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

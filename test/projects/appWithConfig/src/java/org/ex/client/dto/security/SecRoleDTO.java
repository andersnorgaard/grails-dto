package org.ex.client.dto.security;

import java.util.Set;

public class SecRoleDTO implements grails.plugins.dto.DTO {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Set<SecUserDTO> users;
    private String name;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Set<SecUserDTO> getUsers() { return users; }
    public void setUsers(Set<SecUserDTO> users) { this.users = users; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

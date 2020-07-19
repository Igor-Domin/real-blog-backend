package com.domin.realblog.user.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonRootName
import java.util.*
import javax.persistence.*

@Entity
@JsonRootName("user")
@Table(name = "blog_users")
class BlogUser() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: UUID = UUID.randomUUID()
    @JsonIgnore
    var hashedPassword: String = ""
    var email: String = ""
    var username: String = ""
    var bio: String = ""
    var image: String = ""
}
package com.github.vampiur.blogasek.controller;

import com.github.vampiur.blogasek.DbJpaConfig;
import com.github.vampiur.blogasek.GeneralApplicationConfig;
import com.github.vampiur.blogasek.ServletConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServletConfig.class, GeneralApplicationConfig.class, DbJpaConfig.class})
@WebAppConfiguration
public class PostControllerIntegrationTest {

    private final static String CONTROLLER_PATH = "/post";

    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Autowired
    public void setWebApplicationContext(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = webApplicationContext;
    }

    @Before
    public void setup() throws Exception {

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void add() throws Exception {
        //given

        //when
        this.mockMvc.perform(MockMvcRequestBuilders.post(CONTROLLER_PATH).param(null));

        //then

    }

    @Test
    public void edit() throws Exception {
        //given

        //when
        this.mockMvc.perform(MockMvcRequestBuilders.put(CONTROLLER_PATH).param(null));

        //then

    }

    @Test
    public void listWhenNoPosts() throws Exception {
        //given

        //when
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(CONTROLLER_PATH));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$").isEmpty());

    }

    @Test
    public void list() throws Exception {
        //given


        //when
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(CONTROLLER_PATH));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].id", is(1)))
        .andExpect(jsonPath("$[0].text",));
    }

    @Test
    public void show() throws Exception {
        //given

        //when
        this.mockMvc.perform(MockMvcRequestBuilders.get(CONTROLLER_PATH));

        //then

    }

    @Test
    public void delete() throws Exception {
        //given

        //when
        this.mockMvc.perform(MockMvcRequestBuilders.delete(CONTROLLER_PATH));

        //then

    }

}
package by.belstu.varvarinets.controller;

import by.belstu.varvarinets.Application;
import by.belstu.varvarinets.model.UsersEntity;
import by.belstu.varvarinets.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {
    static Logger logger= LoggerFactory.getLogger(Controllers.class);
        private final UserRepository userRepository;

        public Controllers(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

    @RequestMapping(value={"/registration"},method = RequestMethod.POST)
        public @ResponseBody String addNewUser (@RequestParam String name,@RequestParam String login
                , @RequestParam String password, @RequestParam String admin) {
            String rez = "Success";
            try {

                UsersEntity n = new UsersEntity();
                n.setLogin(login);
                if(n.getLogin().length()<4||n.getLogin().length()>16)
                    throw new Error("Wrong login");
                n.setPassword(password);
                if(n.getPassword().length()<6)
                    throw new Error("Password is too Short");
                n.setName(name);
                n.setStatus(Integer.valueOf(admin));
                userRepository.save(n);
                logger.info(rez);
            }
            catch (Exception exception){
                rez=exception.getMessage();

                logger.warn(rez);
            }

            return rez;
        }





}

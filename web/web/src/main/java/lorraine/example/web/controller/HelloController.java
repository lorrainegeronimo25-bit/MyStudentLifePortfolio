package lorraine.example.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    public static class SkillItem {
        private String imageName;
        private String displayName;

        public SkillItem(String imageName, String displayName) {
            this.imageName = imageName;
            this.displayName = displayName;
        }

        public String getImageName() { return imageName; }
        public String getDisplayName() { return displayName; }
    }

    public static class GalleryItem {
        private String fileName;
        private String caption;

        public GalleryItem(String fileName, String caption) {
            this.fileName = fileName;
            this.caption = caption;
        }

        public String getFileName() { return fileName; }
        public String getCaption() { return caption; }
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home - My Portfolio");
        model.addAttribute("name", "My Portfolio");
        model.addAttribute("fullName", "Lorraine Geronimo");
        model.addAttribute("courseSection", "BSIT Student | Section 2A");
        model.addAttribute("welcomeMessage", "\"Welcome! I'm a BSIT student building my way through the world of tech. Here’s a quick look at my skills and the projects I've worked on.\"");
        model.addAttribute("fbLink", "https://www.facebook.com/me/");
        
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Me - Lorraine Geronimo");
        model.addAttribute("name", "My Portfolio");
        model.addAttribute("fullName", "Lorraine Geronimo");
        model.addAttribute("activityImg", "act.jpg");
        model.addAttribute("campusImg", "ba.jpg");
        model.addAttribute("fbLink", "https://www.facebook.com/me/");
        
        return "about"; 
    }
    
    @GetMapping("/journey")
    public String journey(Model model) {
        model.addAttribute("name", "My Portfolio");
        model.addAttribute("fullName", "Lorraine Geronimo");
        model.addAttribute("fbLink", "https://www.facebook.com/me/");
        model.addAttribute("sliderImages", Arrays.asList("po.jpg", "Be.jpg", "bu.jpg"));

        model.addAttribute("boxTitle1", "Favorite Subjects");
        model.addAttribute("boxTitle2", "Class Experiences");
        model.addAttribute("boxTitle3", "Major Challenges");
        model.addAttribute("boxTitle4", "What I've Learned");

        model.addAttribute("list1", Arrays.asList(
            "CC104: Information Management", 
            "CC105: App Dev & Emerging Tech", 
            "GE09: Life and Works of Rizal", 
            "ITPF02: Object-Oriented Programming 2"
        ));

        model.addAttribute("list2", Arrays.asList(
            "Exciting school events and seminars", 
            "Collaborative coding with classmates", 
            "Successful hardware project simulations", 
            "Fun interactions during laboratory activities"
        ));

        model.addAttribute("list3", Arrays.asList(
            "Handling multiple projects simultaneously", 
            "Debugging complex Java applications", 
            "Mastering SQL database connectivity", 
            "Adapting to new emerging technologies"
        ));

        model.addAttribute("list4", Arrays.asList(
            "Persistence is key in coding", 
            "The importance of UI/UX in design", 
            "Effective teamwork in system development", 
            "Valuing Filipino history through Rizal"
        ));

        return "journey";
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("name", "My Portfolio");
        model.addAttribute("fullName", "Lorraine Geronimo");
        model.addAttribute("fbLink", "https://www.facebook.com/me/");

        List<SkillItem> techSkills = Arrays.asList(
            new SkillItem("jav.webp", "Java"),
            new SkillItem("js.png", "JavaScript"),
            new SkillItem("html.png", "HTML5"),
            new SkillItem("css.webp", "CSS3"),
            new SkillItem("c.jpg", "C++")
        );
        model.addAttribute("techSkills", techSkills);

        List<SkillItem> interests = Arrays.asList(
            new SkillItem("music.jpg", "Singing"),
            new SkillItem("composer.jpg", "Songwriting"),
            new SkillItem("cook.jpg", "Cooking"),
            new SkillItem("gaming.jpg", "Online Gaming"),
            new SkillItem("ph.png", "Photography")
        );
        model.addAttribute("interests", interests);

        return "skills";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("name", "My Portfolio");
        model.addAttribute("fullName", "Lorraine Geronimo");
        model.addAttribute("fbLink", "https://www.facebook.com/me/");

        List<GalleryItem> galleryList = Arrays.asList(
            new GalleryItem("Ad.jpeg", "Building our innovative project using Arduino microcontrollers."),
            new GalleryItem("ki.jpg", "Success at Our System Defense! One step closer to the dream"),
            new GalleryItem("Inter.jpeg", "Conducting a field interview for our system requirements gathering."),
            new GalleryItem("Lin.jpg", "Participating in our community service and campus cleaning activity."),
            new GalleryItem("Ben.jpg", "A great experience performing with the program band during the event."),
            new GalleryItem("Por.jpg", "Attending the formal program and academic gathering at NEUST.")
        );
        model.addAttribute("galleryItems", galleryList);

        return "gallery";
    }
}
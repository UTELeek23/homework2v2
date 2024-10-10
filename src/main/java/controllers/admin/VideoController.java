package controllers.admin;

import Entity.Video;
import services.impl.VideoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/admin/videos")
public class VideoController extends HttpServlet {
    private VideoService videoService = new VideoService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            List<Video> videos = videoService.findAll();
            request.setAttribute("videos", videos);
            request.getRequestDispatcher("/views/admin/video-list.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            String videoId = request.getParameter("id");
            Video video = videoService.find(videoId);
            request.setAttribute("video", video);
            request.getRequestDispatcher("/views/admin/video-edit.jsp").forward(request, response);
        } else if (action.equals("delete")) {
            String videoId = request.getParameter("id");
            videoService.delete(videoId);
            response.sendRedirect(request.getContextPath() + "/admin/videos");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("add")) {
            Video video = new Video();
            video.setVideoId(request.getParameter("videoId"));
            video.setTitle(request.getParameter("title"));
            video.setDescription(request.getParameter("description"));
            video.setPoster(request.getParameter("poster"));
            video.setActive(Integer.parseInt(request.getParameter("active")));
            video.setViews(Integer.parseInt(request.getParameter("views")));
            videoService.create(video);
            response.sendRedirect(request.getContextPath() + "/admin/videos");
        } else if (action.equals("update")) {
            Video video = new Video();
            video.setVideoId(request.getParameter("videoId"));
            video.setTitle(request.getParameter("title"));
            video.setDescription(request.getParameter("description"));
            video.setPoster(request.getParameter("poster"));
            video.setActive(Integer.parseInt(request.getParameter("active")));
            video.setViews(Integer.parseInt(request.getParameter("views")));
            videoService.update(video);
            response.sendRedirect(request.getContextPath() + "/admin/videos");
        }
    }
}

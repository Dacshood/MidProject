package co.teakjjo.prj.news.service;

import java.util.List;

public interface NewsMapper {
	List<NewsVO> newsList();
	List<NewsVO> newsGenreList(String newsboard_genre);
	NewsVO newsGenreSearch(String newsboard_title);
	List<NewsVO> newsMyList(String member_id);
	int newsInsert(NewsVO news);
	int newsDelete(NewsVO news);
	int newsUpdate(String newsboard_title);
}

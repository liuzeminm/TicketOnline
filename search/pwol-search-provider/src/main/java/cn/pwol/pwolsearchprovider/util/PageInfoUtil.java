package cn.pwol.pwolsearchprovider.util;

import java.util.List;

public class PageInfoUtil<T> {
    private Integer pageNum;//当前页
    private Integer totalPage; //总页数
    private Integer prePage; //上一页
    private Integer nextPage; //下一页
    private Integer navigateFirstPage; //首页
    private Integer navigateLastPage; //尾页
    protected List<T> list;

    public PageInfoUtil() {}

    public PageInfoUtil(int pageNum, int totalPage, List<T> list) {
        pageNum = pageNum > 0 ? pageNum : 1;
        this.pageNum = pageNum >= totalPage ? totalPage > 0 ? totalPage : 1 : pageNum;
        this.totalPage = totalPage > 0 ? totalPage : 1;
        this.navigateFirstPage = 1;
        this.navigateLastPage = getTotalPage();
        this.prePage = getPageNum() >= getNavigateFirstPage() && getPageNum() - 1 > 0 ? getPageNum() - 1 : getNavigateFirstPage();
        this.nextPage = getPageNum() >= getNavigateLastPage() ? getNavigateLastPage() : getPageNum() + 1;
        this.list = list;
    }

    public PageInfoUtil(int pageNum, int totalCount, int pageSize, List<T> list) {
        pageNum = pageNum > 0 ? pageNum : 1;
        pageSize = pageSize > 0 ? pageSize : 1;
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        this.pageNum = pageNum >= totalPage ? totalPage > 0 ? totalPage : 1 : pageNum;
        this.totalPage = totalPage > 0 ? totalPage : 1;
        this.navigateFirstPage = 1;
        this.navigateLastPage = getTotalPage();
        this.prePage = getPageNum() >= getNavigateFirstPage() && getPageNum() - 1 > 0 ? getPageNum() - 1 : getNavigateFirstPage();
        this.nextPage = getPageNum() >= getNavigateLastPage() ? getNavigateLastPage() : getPageNum() + 1;
        this.list = list;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public Integer getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public Integer getNavigateLastPage() {
        return navigateLastPage;
    }

    public List<T> getList() {
        return list;
    }
}

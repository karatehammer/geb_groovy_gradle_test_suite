import geb.Page

class GoogleHomePage extends Page{

    static at = { title == "Google"}

    static content = {
        searchBar {$('id[lst-ib]')}
    }

}

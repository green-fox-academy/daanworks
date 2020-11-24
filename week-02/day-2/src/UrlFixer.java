public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String fixedUrlwithColonPart1;
        String fixedUrlwithColonPart2;

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        // Solution1:

        if(url.substring(5,6) == ":") {
            System.out.println(url);
        } else {
            fixedUrlwithColonPart1 = url.substring(0, 5);
            fixedUrlwithColonPart2 = url.substring(5);
            System.out.println(fixedUrlwithColonPart1 + ":" + fixedUrlwithColonPart2);
        }

        // Solution2:

        String fixedUrl;

        fixedUrl = url.replace("https//", "https://");
        System.out.println(fixedUrl);

        // Solution3:

        String[] fixedUrlArray;

        fixedUrlArray = url.split("//");
        System.out.println(fixedUrlArray[0] + "://" + fixedUrlArray[1]);

    }
}

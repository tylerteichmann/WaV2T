class Artist:
    # TODO: Define constructor with parameters to initialize instance attributes
    #       (name, birth_year, death_year)
    def __init__(self, name="unknown", birth_year=-1, death_year=-1):
        self.name = name
        self.birth_year = birth_year
        self.death_year = death_year

    # TODO: Define print_info() method
    def print_info(self):
        print(f"Artist: {self.name}", end=' ')
        if self.birth_year >= 0:
            print(f"({self.birth_year} to", end=' ')
            if self.death_year >= 0:
                print(f"{self.death_year})")
            else:
                print(f"present)")
        else:
            print(f"unknown")



      
class Artwork:
    # TODO: Define constructor with parameters to initialize instance attributes
    #       (title, year_created, artist)
    def __init__(self, title="unknown", year_created=-1, artist=Artist):
        self.title = title
        self.year_created = year_created
        self.artist = artist

    # TODO: Define print_info() method
    def print_info(self):
        print(f"Title: {self.title}, {self.year_created}")


if __name__ == "__main__":
    user_artist_name = input()
    user_birth_year = int(input())
    user_death_year = int(input())
    user_title = input()
    user_year_created = int(input())

    user_artist = Artist(user_artist_name, user_birth_year, user_death_year)

    new_artwork = Artwork(user_title, user_year_created, user_artist)
  
    user_artist.print_info()
    new_artwork.print_info()